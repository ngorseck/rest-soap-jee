
package com.samanecorp.soap1Client.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour minus complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="minus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minus", propOrder = {
    "num1",
    "num2"
})
public class Minus {

    protected int num1;
    protected int num2;

    /**
     * Obtient la valeur de la propriété num1.
     * 
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Définit la valeur de la propriété num1.
     * 
     */
    public void setNum1(int value) {
        this.num1 = value;
    }

    /**
     * Obtient la valeur de la propriété num2.
     * 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Définit la valeur de la propriété num2.
     * 
     */
    public void setNum2(int value) {
        this.num2 = value;
    }

}
