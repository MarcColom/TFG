 angular
        .module('contactApp', [])
                	
        .controller('contactCtrl', ['$http', function($http){		 
		    
        		var vm=this;
        		vm.contact = {};        		
        		        	    
        	    });		
		        
		        vm.sendContact = function(){	        	 	
		        			        	
		        	$http.post("http://localhost:8080/AngularProva/WSUserRest/addUser", params)
		        		.success(function(){                
		                 console.log("OK DE POST");
		        		})
		        		.error(function(){                
		                 console.log("ERROR DE POST");
		        		});
		           			        	
		        	vm.contact = {};
		            }  
		      
         }]);