/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.projects.ws.heapbeats;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chernykh_vv
 */
@WebService(serviceName = "HeapBeatsWebServiceImpl")
public class HeapBeatsWebServiceImpl {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "getTotalMemory")
    public long getTotalMemory() {
        // Get current size of heap in bytes
        return Runtime.getRuntime().totalMemory();
    }

    @WebMethod(operationName = "getMaxMemory")
    public long getMaxMemory() {
        // Get current size of heap in bytes
        return Runtime.getRuntime().maxMemory();
    }

    @WebMethod(operationName = "getFreeMemory")
    public long getFreeMemory() {
        // Get current size of heap in bytes
        return Runtime.getRuntime().freeMemory();
    }

}
