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
        	        	
        	return data;     	        	     	
        })
        
                	
        .controller('UserFormCtrl', function($location, formFactory, findInsuranceFactory){		 
		
        		var vm = this;        		
        		vm.today = formFactory.today;        		     		
        		  		
        		vm.AddForm = function(){       				
        			formFactory.form = vm.user;		        	
		        	vm.user = {};		       	        	
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
        		vm.customer = {};
        		vm.persons = {};
        		vm.payment = {};
        		vm.address = {};        		
        		vm.personNum = 1;
        		
        		vm.getPaxsNumber = function() {
        		    return new Array(vm.personNum);   
        		}
        		
        		vm.sendOrder = function(){	 
        		
        			console.log("ESTIC A SEND ORDER DEL CTRL");
        				
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
				console.log("OK DE POST");
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
	     		.success(function(answer){                
	     			ct.contactAnswer = answer;
	     			console.log("OK DE POST");
	     		})
	     		.error(function(){                
	              console.log("ERROR DE POST");
	     		});   			        	
	     	
	     	ct.contact = {};		        			        	
	     }	      
	}]);
	        
	        
	
 
		 	        
	        
       
  
    
  
 
  
 

  