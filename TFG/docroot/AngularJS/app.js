 angular
        .module('app', ["ngRoute"])
        
        .config(function($routeProvider){        	        	
        	
        	$routeProvider
        	.when("/",{
        		controller: "UserFormCtrl",
        		controllerAs: "formCtrl",
        		templateUrl: "findInsuranceView.html"       			
        	})
        	.when("/showInsurancesView",{
        		controller: "ShowInsuranceCtrl",
        		controllerAs: "showCtrl",        	
        		templateUrl: "showInsurancesView.html"        		
        	})
        	.when("/orderView",{
        		controller: "OrderCtrl",
        		controllerAs: "orderCtrl",
        		templateUrl: "orderView.html"        		
        	})
        	.when("/showOrderView",{
        		controller: "ShowOrderCtrl",
        		controllerAs: "showOrderCtrl",
        		templateUrl: "showOrderView.html"
        	})
        	.when("/findOrderView",{
        		controller: "FindOrderCtrl",
        		controllerAs: "findOrderCtrl",
        		templateUrl: "findOrderView.html"
        	})
        	.when("/contact",{
        		controller: "contactCtrl",
        		controllerAs: "ct",
        		templateUrl: "contact.html"
        	})
        	.when("/faqs",{
        		controller: "contactCtrl",
        		controllerAs: "ct",
        		templateUrl: "faqs.html"
        	})       	
        	
        	.otherwise({ reditrectTo : "/" });        	
        	
        })
        
        
        .factory("formFactory", function(){        	 
        	
        	var data = {};            
            data.today = new Date(),
            data.form = {};          
                         
            return data;
        })  
        
        .factory("findInsuranceFactory", function(){
        	       	
        	var data = this;
        	data.form = {};
        	data.insurances = {};       	      	
        	        	
        	return data;     	        	     	
        })
        
        .factory("orderFactory", function(){
        	       	
        	var data = {};
        	data.form = {};
        	data.insurance = {};
        	data.user = {};        	
        	
        	data.customer = {};
        	data.address = {};
        	data.payment = {};
        	data.order = {};
        	        	
        	return data;     	        	     	
        })
        
        .factory("showFindOrder", function(){
        	var data = this;
        	data.order = {};
        	return data;        	
        })       
                	
        .controller('UserFormCtrl', function($location, formFactory, findInsuranceFactory){		 
		
        		var vm = this;        		
        		vm.today = formFactory.today;        		     		
        		  		
        		vm.AddForm = function(){        			
        			formFactory.form = vm.user;		        	
		        	//vm.user = {};		       	        	
		        	$location.url("/showInsurancesView");	        	
		        }		      
         })
         
         .controller('ShowInsuranceCtrl', function($http, $location, formFactory, findInsuranceFactory, orderFactory){	
        	
        	 var vm = this;       	 
        	 vm.insurances = {};
        	 vm.form = formFactory.form;
        	 vm.today = formFactory.today; 
        	 
        	 $http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/findInsurances", {params: 
 				{origin: vm.form.origin,
				destination: vm.form.destination,
				initDate: vm.form.initDate,
				endDate: vm.form.endDate}
        	 })	        	
			.success(function(respuesta){				
				vm.insurances = respuesta;								
				console.log("OK DE POST");
			})
			.error(function(){	        				 
				console.log("ERROR DE POST");
			});  
        	 
        	vm.AddInsurance = function(insurance){
        		vm.myInsurance = insurance;
        		orderFactory.form = vm.form;
        		orderFactory.insurance = vm.myInsurance;        		
        		$location.url("/orderView");	
        		
        	}
        	 
         })
         
         .controller('OrderCtrl', function($http, $location, orderFactory){		 
		
        		var vm = this;        		
        		vm.form = orderFactory.form;        		
        		vm.insurance = orderFactory.insurance;        		
        		vm.persons = {};        		
        		vm.personNum = 1;
        		
        		vm.customer = orderFactory.customer;
        		vm.address = orderFactory.address;
        		vm.payment = orderFactory.payment;        		
        		//vm.order = orderFactory.order;
        	
        		
        		vm.getPaxsNumber = function() {
        		    return new Array(vm.personNum);   
        		}
        		
        		vm.sendOrder = function(){ 		
        		
		        // SEND PAYMENT //        		        	
        			var params = {
       					ccType: vm.payment.ccType,
       					ccNumber: vm.payment.ccNumber,
       					ccExp: vm.payment.ccExp,
       					ccCvs: vm.payment.ccCvs,
       					ccName: vm.payment.ccName,
       					//customer: vm.customer.surname
    		        };	 	
    		        $http.post("http://localhost:8080/SegurosyViajes/WSUserOrderRest/payment", params)
    		        .success(function(isPay){
    		         vm.isPay = isPay; 	
	                 console.log("OK SEND PAYMENT");
	        		})
	        		.error(function(){                
	                 console.log("ERROR DE POST");
	        		});      
    		     
    		        
    		     // SEND ORDER //
    		        vm.isNotBuy = false;
    		        
            		$http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/order", {params: 
            		{  insuranceCode: vm.insurance.code,
            		   destinationCode: vm.insurance.destinationCode,
            		   duracionCode: vm.insurance.duracionCode,
            		   initDate: vm.form.initDate,        		   
            		   paxsNum: vm.personNum,
            		   city: vm.customer.address.city,        		   
            		   persons: vm.order.persons        			        			        	
            		}
            		})      		        		
            		.success(function(respuesta){				
    				vm.orderConfirmation = respuesta;
    				orderFactory.order = vm.orderConfirmation;
    				console.log("OK SEND ORDER");			
    				
    				orderFactory.insurance = vm.insurance;
            		orderFactory.form = vm.form;
            		        		          	
            		orderFactory.customer = vm.customer;
            		orderFactory.address = vm.address;
            		orderFactory.payment = vm.payment; 
            		$location.url("/showOrderView");
            		})
    				.error(function(){	        				 
    				console.log("ERROR DE POST");    				
     		        vm.isNotBuy = true;
    				}); 
            		
            		
            	}        		
         })	
         
        .controller('ShowOrderCtrl', function($http, $location, orderFactory){		 
		        		
        		var vm = this;      		
        		vm.insurance = orderFactory.insurance;
        		vm.customer = orderFactory.customer;
        		vm.address = orderFactory.address;
        		vm.payment = orderFactory.payment;
        		vm.order = orderFactory.order;    
        		
        		
        		// SEND CUSTOMER //        		
		        $http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/addCustomer", {params:
		        	{orderId: vm.order.id, 
		        	name: vm.customer.name,
		        	surnames: vm.customer.surname,
	        		email: vm.customer.email,
	        		phone: vm.customer.phone,
	        		address: vm.customer.address.address,
	        		city: vm.customer.address.city,
	        		province: vm.customer.address.province,
	        		postalCode: vm.customer.address.postalCode,
	        		country: vm.customer.address.country 
		        	}
		        	})		        	
		        	
		        .success(function(){ 		        	
		        	console.log("OK DE SEND CUSTOMER");    		        	
		        })
		        .error(function(){                
		           console.log("ERROR DE POST");
		        });
        		
        		
        		// SEND CONFIRMATION EMAIL //	
        		$http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/sendConfirmation", {params: 
        		{  orderId: vm.order.code            			
        		}
        		})
        		.success(function(){       		          	
	                 console.log("OK SEND EMAIL");
	        	})
	        	.error(function(){                
	                 console.log("ERROR DE POST");
	        	});        
        		
        })
        
        .controller('FindOrderCtrl', function($http, $location, showFindOrder){		 
		        		
        		var vm = this;        		        		
        		
        		vm.codeFindOrder = function(){
        			vm.order = {};
        			vm.isFound = false;
            		vm.isNotFound = false;
            		
            		$http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/findOrderById", {params: 
            		{  orderId: vm.code,
            		   email: vm.email            		   	
            		}
            		})
            		.success(function(respuestaCode){  
            			 vm.order = respuestaCode;
            			 console.log("OK SEND FIND ID"); 
            			 if (vm.order.id == null) {
            		            vm.isNotFound = true;
            		        } else {
            		        	vm.isFound = true;
            		        }            			 
            			 showFindOrder.order = vm.order;    	                     	                 
    	        	})
    	        	.error(function(){                
    	                 console.log("ERROR DE POST");
    	        	});        			
        		}
        		
        		vm.nameFindOrder = function(){  
        			vm.order = {};
        			vm.isFound = false;
            		vm.isNotFound = false;
            		
        			$http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/findOrderByName", {params: 
            		{  name: vm.name,
        			   surnames: vm.surnames,
            		   email: vm.email            		   	
            		}
            		})
            		.success(function(respuestaName){
            			 vm.order = respuestaName;
    	                 console.log("OK SEND FIND NAME");    	                 
    	                 if (vm.order.id == null) {
         		             vm.isNotFound = true;
         		        } else {
         		        	vm.isFound = true;
         		        }
    	        	})
    	        	.error(function(){                
    	                 console.log("ERROR DE POST");
    	        	});
        		}  		
        		        		
        })
         
         
	 	.controller('contactCtrl', ['$http', function($http){		 
	 		
			var ct=this;
			ct.contact = {};			
			       	           
			ct.sendContact = function(){	        	    
					        	
	     	$http.get("http://localhost:8080/SegurosyViajes/WSUserOrderRest/contact", {params: {	nombre: ct.contact.nombre,
																							        	email: ct.contact.email,
																						        		asunto: ct.contact.asunto,		        		
																						        		consulta: ct.contact.texto		        		
																						        	    }	    
	     																				  })
	     		.success(function(){	     			
	     			console.log("OK DE POST");
	     		})
	     		.error(function(){                
	              console.log("ERROR DE POST");
	     		});   			        	
	     	ct.contactAnswer = "Tu consulta se ha enviado correctamente. En breve nos pondermos en contacto contigo";
	     	//ct.contact = {};		        			        	
	     }	      
	}]);
	        
	        
	
 
		 	        
	        
       
  
    
  
 
  
 

  