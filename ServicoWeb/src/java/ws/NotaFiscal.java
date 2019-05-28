
package ws;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class NotaFiscal {
    @XmlElement
    public long numero;
    @XmlElement
    public String dataEmissao;
    @XmlElement
    public Double valor;
    @XmlElement
    public Double icms;
    @XmlAttribute
    public Double cofins;

   
    
    
    
    
}
