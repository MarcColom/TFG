 angular
        .module('app', [])
                	
        .controller('InsuranceRequestCtrl', ['$http', function($http){		 
		    
        		var vm=this;
        		vm.users = {};
        		
        		vm.today = new Date();        		
		        
		        vm.AddRestEJB = function(){       
		        			        	
		        	var params = {
		        		residencia: vm.user.origin,		        		
		        		destino: vm.user.destination,
		        		inicio: vm.user.initDate,
		        		fin: vm.user.endDate
		        	};	        	
		        			        	
		        	$http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/findInsurances", params)
		        		.success(function(respuesta){                
		        			vm.users = respuesta;		 
		        			console.log("OK DE POST");
		        		})
		        		.error(function(respuesta){                
		        			vm.users = respuesta;		 
		        			console.log("ERROR DE POST");
		        		});
		           	
		        	vm.users.push(vm.user);
		        	vm.user = {};
		        	$scope.userForm.$setPristine();
		        }  
		      
         }]);
	
 
		 	        
	        
       
  
    
  
 
  
 

  