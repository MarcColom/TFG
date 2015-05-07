 angular
        .module('app', [])
                	
        .controller('InsuranceRequestCtrl', ['$http', function($http){		 
		    
        		var vm=this;
        		vm.insurances = {};
        		vm.users = {};        		
        		vm.today = new Date();        		
		        
		        vm.AddRestEJB = function(){       
		        			        	
		        	var params = {
		        		initDate: vm.user.initDate,
			        	endDate: vm.user.endDate,
		        		origin: vm.user.origin,		        		
		        		destination: vm.user.destination		        		
		        	};	        	
		        			        	
		        	$http.post("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/findInsurances", params)
		        		.success(function(){                
		        			//vm.insurances = respuesta;		 
		        			console.log("OK DE POST");
		        		})
		        		.error(function(){                
		        			//vm.insurances = respuesta;		 
		        			console.log("ERROR DE POST");
		        		});
		        	
		        	vm.user = {};
		        	
		        }  
		      
         }]);
	
 
		 	        
	        
       
  
    
  
 
  
 

  