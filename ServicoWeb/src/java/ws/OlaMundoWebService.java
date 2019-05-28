
package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName = "ServicoExemplo",name="OlaMundo")
public class OlaMundoWebService {
    
//    @WebMethod
//    public String dizerOla(){
//        
//        return "Hello World!";
//        
//    }
    
    @WebMethod
    public NotaFiscal emitir(){       
        
        return new NotaFiscal();
    }
    
    
}
