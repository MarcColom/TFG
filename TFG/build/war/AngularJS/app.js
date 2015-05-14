 angular
        .module('app', [])
                	
        .controller('InsuranceRequestCtrl', ['$http', function($http){		 
		    
        		var vm=this;
        		vm.insurances = {};
        		vm.users = {};        		
        		vm.today = new Date();        		
		        
		        vm.AddRestEJB = function(){       
		       
		        	$http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/prova")
		        	.success(function(){       				 
		        			console.log("OK DE POST");		        			
		        		})
		        		.error(function(){	        				 
		        			console.log("ERROR DE POST");
		        		});		        	
		        	
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
		      
         }]);
	
 
		 	        
	        
       
  
    
  
 
  
 

  