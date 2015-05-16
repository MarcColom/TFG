 angular
        .module('app', ["ngRoute"])
        
        .config(function($routeProvider){        	        	
        	
        	$routeProvider
        	.when("/",{
        		controller: "InsuranceRequestCtrl",
        		controllerAs: "vm",
        		templateUrl: "findInsuranceView.html"
        	})
        	.when("/showInsurancesView",{
        		controller: "InsuranceRequestCtrl",
        		controllerAs: "vm",
        		templateUrl: "showInsurancesView.html"
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
                	
        .controller('InsuranceRequestCtrl', ['$http', function($http){		 
		    
        		var vm=this;
        		vm.insurances = {};
        		vm.users = {};        		
        		vm.today = new Date();        		
		        
		        vm.AddRestEJB = function(){   	        	        	
		        	
		        	  $http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/findInsurances", {params: {origin: vm.user.origin,
		        		  																							destination: vm.user.destination,
		        		  																							initDate: vm.user.initDate,
		        		  																							endDate: vm.user.endDate}
		        	  																						})	        	
		        		.success(function(respuesta){                
		        			vm.insurances = respuesta;		 
		        			console.log("OK DE POST");
		        		})
		        		.error(function(){	        				 
		        			console.log("ERROR DE POST");
		        		});
		        	
		        	//vm.insurances.push(vm.order);
		        	//vm. order = {};
		        	vm.user = {};		        	
		        }  
		      
         }])
         
	 	.controller('contactCtrl', ['$http', function($http){		 
	 		
			var ct=this;
			ct.contact = {};			
			       	           
			ct.sendContact = function(){	        	    
					        	
	     	$http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/contact", {params: {	nombre: ct.contact.nombre,
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
	        
	        
	
 
		 	        
	        
       
  
    
  
 
  
 

  