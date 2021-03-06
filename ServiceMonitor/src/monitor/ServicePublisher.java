/*
 * Copyright 2001-2010 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package monitor;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;
import logger.MonitorLogger;

import org.apache.juddi.api_v3.Publisher;
import org.apache.juddi.api_v3.PublisherDetail;
import org.apache.juddi.api_v3.SavePublisher;
import org.apache.juddi.v3_service.JUDDIApiPortType;
import org.uddi.api_v3.AccessPoint;
import org.uddi.api_v3.AuthToken;
import org.uddi.api_v3.BindingTemplate;
import org.uddi.api_v3.BindingTemplates;
import org.uddi.api_v3.BusinessDetail;
import org.uddi.api_v3.BusinessEntity;
import org.uddi.api_v3.BusinessInfo;
import org.uddi.api_v3.BusinessInfos;
import org.uddi.api_v3.BusinessList;
import org.uddi.api_v3.BusinessService;
import org.uddi.api_v3.Description;
import org.uddi.api_v3.FindBusiness;
import org.uddi.api_v3.GetAuthToken;
import org.uddi.api_v3.Name;
import org.uddi.api_v3.SaveBusiness;
import org.uddi.api_v3.SaveService;
import org.uddi.api_v3.ServiceDetail;
import org.uddi.v3_service.UDDIPublicationPortType;
import org.uddi.v3_service.UDDISecurityPortType;
//import audit.AuditLogger;


public class ServicePublisher {

    private static String[][] services;
    private static UDDISecurityPortType security = null;
    private static JUDDIApiPortType juddiApi = null;
    private static UDDIPublicationPortType publish = null;
    private static String uddiUrl = "http://localhost:8080/juddiv3/services/";
    private static String ip;
    private static String port;

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        ServicePublisher.ip = ip;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        ServicePublisher.port = port;
    }
        
    public static void generateServices() {
        //[i][0] = Nombre 
        //[i][1] = Descripcion 
        //[i][2] = URL del wsdl        
        String url="http://"+ip+":"+port;                
        //uddiUrl=url+"/juddiv3/services/";
        
        url+="/Sor_Servicios";
        
        services = new String[19][3];
        services[0][0] = "LoginClientes";
        services[0][1] = "Login de clientes";
        services[0][2] = url+"/LoginClientes?wsdl"; 
        
        services[1][0] = "RegistroDesguace";
        services[1][1] = "Registro de Desguaces";
        services[1][2] = url+"/RegistroDesguace?wsdl"; 
        
        services[2][0] = "DarOfertasSeleccionadas";
        services[2][1] = "Dar las ofertas seleccionadas";
        services[2][2] = url+"/DarOfertasSeleccionadas?wsdl"; 
        
        services[3][0] = "BorrarPeticion";
        services[3][1] = "Borra una peticion";
        services[3][2] = url+"/BorrarPeticion?wsdl"; 
        
        services[4][0] = "DarOfertasRequestOk";
        services[4][1] = "Dar las ofertas aceptadas de una peticion";
        services[4][2] = url+"/DarOfertasRequestOk?wsdl"; 
        
        services[5][0] = "DarIdDesguacebyCif";
        services[5][1] = "Dar la id de un desguace con su cif";
        services[5][2] = url+"/DarIdDesguacebyCif?wsdl"; 
        
        services[6][0] = "RegistroCliente";
        services[6][1] = "Registro de un cliente";
        services[6][2] = url+"/RegistroCliente?wsdl"; 
        
        services[7][0] = "DarOfertasRequest";
        services[7][1] = "Dar ofertas de una request";
        services[7][2] = url+"/DarOfertasRequest?wsdl"; 
        
        services[8][0] = "DarPeticionesNifP"; 
        services[8][1] = "Dar las peticiones pendientes por nif";
        services[8][2] = url+"/DarPeticionesNifP?wsdl"; 
        
        services[9][0] = "DarIdClientebyNif"; 
        services[9][1] = "Dar la id de un cliente meidante su nif";
        services[9][2] = url+"/DarIdClientebyNif?wsdl"; 
        
        services[10][0] = "AceptarOfertas"; 
        services[10][1] = "Acepta ofertas";
        services[10][2] = url+"/AceptarOfertas?wsdl"; 
        
        services[11][0] = "DarNombreCliente"; 
        services[11][1] = "Da el nombre de un cliente";
        services[11][2] = url+"/DarNombreCliente?wsdl"; 
        
        services[12][0] = "FinishCom"; 
        services[12][1] = "Finaliza la sesion";
        services[12][2] = url+"/FinishCom?wsdl"; 
        
        services[13][0] = "NewPeticion"; 
        services[13][1] = "Crea una nueva peticion";
        services[13][2] = url+"/NewPeticion?wsdl"; 
        
        services[14][0] = "DarUnidades"; 
        services[14][1] = "Da las unidades de tamaño";
        services[14][2] = url+"/DarUnidades?wsdl"; 
        
        services[15][0] = "DarPeticionesNifF"; 
        services[15][1] = "Da las peticiones pendientes por nif";
        services[15][2] = url+"/DarPeticionesNifF?wsdl"; 
        
        services[16][0] = "InitCom"; 
        services[16][1] = "Inicia la sesion";
        services[16][2] = url+"/InitCom?wsdl"; 
        
        services[17][0] = "LoginDesguace"; 
        services[17][1] = "Login de un desguace";
        services[17][2] = url+"/LoginDesguace?wsdl"; 
        
        services[18][0] = "PassManager"; 
        services[18][1] = "Recuperacion de contraseña";
        services[18][2] = url+"/PassManager?wsdl"; 
    }

    public static void publish(String _ip, String _port) {                                          
        try {            
            ip=_ip;
            port=_port;
            generateServices();
            //Credenciales para el authToken
            GetAuthToken getAuthTokenRoot = new GetAuthToken();
            getAuthTokenRoot.setUserID("root");
            getAuthTokenRoot.setCred("root");

            // Making API call that retrieves the authentication token for the 'root' user.
            AuthToken rootAuthToken = getAuthToken(getAuthTokenRoot);
            System.out.println("root AUTHTOKEN = " + rootAuthToken.getAuthInfo());

            // Creating a new publisher that we will use to publish our entities to.
            Publisher p = new Publisher();
            p.setAuthorizedName("PapeTeam");
            p.setPublisherName("PapeTeam");

            // Adding the publisher to the "save" structure, using the 'root' user authentication info and saving away. 
            SavePublisher sp = new SavePublisher();
            sp.getPublisher().add(p);
            sp.setAuthInfo(rootAuthToken.getAuthInfo());
            savePublisher(sp);

            // Our publisher is now saved, so now we want to retrieve its authentication token
            GetAuthToken getAuthTokenMyPub = new GetAuthToken();
            getAuthTokenMyPub.setUserID("SOR");
            getAuthTokenMyPub.setCred("");
            AuthToken myPubAuthToken = getAuthToken(getAuthTokenMyPub);
            //System.out.println("SOR: AUTHTOKEN = " + myPubAuthToken.getAuthInfo());

            
            // Creating the parent business entity that will contain our service.
            BusinessEntity myBusEntity = new BusinessEntity();
            Name myBusName = new Name();
            myBusName.setValue("Gestor");
            myBusEntity.getName().add(myBusName);
            
            FindBusiness fb = new FindBusiness();
            Name n = new Name();
            n.setValue("Gestor");
            fb.getName().add(n);
            BusinessList busList = findBusiness(fb);
            BusinessInfos businessInfos = busList.getBusinessInfos();
            if(businessInfos!=null){
                  
                  List<BusinessInfo> businessInfoList = businessInfos.getBusinessInfo();
                  if (businessInfoList.size()> 0) {
                      myBusEntity.setBusinessKey(businessInfoList.get(0).getBusinessKey());
                  }
            
            }
          
            
            // Adding the business entity to the "save" structure, using our publisher's authentication info and saving away.
            SaveBusiness sb = new SaveBusiness();
            sb.getBusinessEntity().add(myBusEntity);
            sb.setAuthInfo(myPubAuthToken.getAuthInfo());
            BusinessDetail bd = saveBusiness(sb);
            String myBusKey = bd.getBusinessEntity().get(0).getBusinessKey();
            System.out.println("myBusiness key:  " + myBusKey);

            /*
                ======= Foreach webservice ======
            */
            for (String[] service : services) {                                            
                BusinessService myService = new BusinessService();
                myService.setBusinessKey(myBusKey);
                Name myServName = new Name();
                myServName.setValue(service[0]);
                myService.getName().add(myServName);
                Description myServDescription = new Description();
                myServDescription.setValue(service[1]);
                myService.getDescription().add(myServDescription);

                // Add binding templates, etc...
                BindingTemplate myBindingTemplate = new BindingTemplate();
                AccessPoint accessPoint = new AccessPoint();
                accessPoint.setValue(service[2]);
                myBindingTemplate.setAccessPoint(accessPoint);
                //myBindingTemplate.setBindingKey("TallerWS"); --> no sé si hace falta
                BindingTemplates myBindingTemplates = new BindingTemplates();
                myBindingTemplates.getBindingTemplate().add(myBindingTemplate);
                myService.setBindingTemplates(myBindingTemplates);

                // Adding the service to the "save" structure, using our publisher's authentication info and saving away.
                SaveService ss = new SaveService();
                ss.getBusinessService().add(myService);
                ss.setAuthInfo(myPubAuthToken.getAuthInfo());
                ServiceDetail sd = saveService(ss);
                String myServKey = sd.getBusinessService().get(0).getServiceKey();
                //System.out.println("Publicado servicio " + service[0] + " direccion: " + myServKey);
            }
            /*
                ===== End foreach ==
            */                   
            MonitorLogger.setLogMessage(3, ip, "");       
        } catch (Exception ex) {
             MonitorLogger.setLogMessage(-3, ip, "");       
        }
    }
    
    private static AuthToken getAuthToken(org.uddi.api_v3.GetAuthToken body) {        
        org.uddi.v3_service.UDDISecurityService service;
		try {
			service = new org.uddi.v3_service.UDDISecurityService(new URL(uddiUrl+"security?wsdl"));
			org.uddi.v3_service.UDDISecurityPortType port = service.getUDDISecurityImplPort();
			return port.getAuthToken(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        return null;
    }
    
    private static BusinessDetail saveBusiness(org.uddi.api_v3.SaveBusiness body) {
        org.uddi.v3_service.UDDIPublicationService service;
		try {
			service = new org.uddi.v3_service.UDDIPublicationService(new URL(uddiUrl+"publish?wsdl"));
			org.uddi.v3_service.UDDIPublicationPortType port = service.getUDDIPublicationImplPort();
	        return port.saveBusiness(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
}

    private static ServiceDetail saveService(org.uddi.api_v3.SaveService body) {
       org.uddi.v3_service.UDDIPublicationService service;
		try {
			service = new org.uddi.v3_service.UDDIPublicationService(new URL(uddiUrl+"publish?wsdl"));
	        org.uddi.v3_service.UDDIPublicationPortType port = service.getUDDIPublicationImplPort();
	        return port.saveService(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    private static void deleteBusiness(org.uddi.api_v3.DeleteBusiness body) {
       org.uddi.v3_service.UDDIPublicationService service;
		try {
			service = new org.uddi.v3_service.UDDIPublicationService(new URL(uddiUrl+"publish?wsdl"));
	        org.uddi.v3_service.UDDIPublicationPortType port = service.getUDDIPublicationImplPort();
	        port.deleteBusiness(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }

    private static BusinessList findBusiness(org.uddi.api_v3.FindBusiness body) throws RemoteException {
        org.uddi.v3_service.UDDIInquiryService service;
		try {
			service = new org.uddi.v3_service.UDDIInquiryService(new URL(uddiUrl+"inquiry?wsdl"));
	        org.uddi.v3_service.UDDIInquiryPortType port = service.getUDDIInquiryImplPort();
	        return port.findBusiness(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    private static PublisherDetail savePublisher(org.apache.juddi.api_v3.SavePublisher body) {
        org.apache.juddi.v3_service.JUDDIApiService service;
		try {
			service = new org.apache.juddi.v3_service.JUDDIApiService(new URL(uddiUrl+"juddi-api?wsdl"));
	        org.apache.juddi.v3_service.JUDDIApiPortType port = service.getJUDDIApiImplPort();
	        return port.savePublisher(body);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}

