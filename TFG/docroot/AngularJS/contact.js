 angular
        .module('contact', [])
                	
        .controller('contactCtrl', ['$http', function($http){		 
		    
        		var ct=this;
        		ct.contacts = {};        		
        		       	           
		        ct.sendContact = function(){
		        	
		        	var params = {
			        		nombre: ct.contact.nombre,
				        	email: ct.contact.email,
			        		asunto: ct.contact.asunto,		        		
			        		consulta: ct.contact.texto		        		
			        	};	    
		        			        	
		        	$http.post("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/contact", params)
		        		.success(function(){                
		                 console.log("OK DE POST");
		        		})
		        		.error(function(){                
		                 console.log("ERROR DE POST");
		        		});
		           			        	
		        	//ct.contacts.push(ct.contact);
		        	ct.contact = {};		        			        	
		        }  
		      
         }]);