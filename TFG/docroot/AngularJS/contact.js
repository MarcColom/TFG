 angular
        .module('contact', [])
                	
        .controller('contactCtrl', ['$http', function($http){		 
		    
        		var ct=this;
        		ct.contacts = {};
        		ct.contactAnswer = {};
        		       	           
		        ct.sendContact = function(){	        	    
		        			        	
		        	$http.get("http://localhost:8080/SegurosyViajes/WSUserInsuranceRest/contact", {params: {
																							        		nombre: ct.contact.nombre,
																								        	email: ct.contact.email,
																							        		asunto: ct.contact.asunto,		        		
																							        		consulta: ct.contact.texto		        		
																							        	    }	    
		        																				  })
		        		.success(function(respuesta){                
		        			ct.contactAnswer = respuesta;
		        			console.log("OK DE POST");
		        		})
		        		.error(function(){                
		                 console.log("ERROR DE POST");
		        		});
		           			        	
		        	//ct.contacts.push(ct.contact);
		        	ct.contact = {};		        			        	
		        }	      
         }]);