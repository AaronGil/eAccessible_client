package webService;

public class EAccessibleWebServiceProxy implements webService.EAccessibleWebService {
  private String _endpoint = null;
  private webService.EAccessibleWebService eAccessibleWebService = null;
  
  public EAccessibleWebServiceProxy() {
    _initEAccessibleWebServiceProxy();
  }
  
  public EAccessibleWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEAccessibleWebServiceProxy();
  }
  
  private void _initEAccessibleWebServiceProxy() {
    try {
      eAccessibleWebService = (new webService.EAccessibleWebServiceServiceLocator()).geteAccessibleWebServicePort();
      if (eAccessibleWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eAccessibleWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eAccessibleWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eAccessibleWebService != null)
      ((javax.xml.rpc.Stub)eAccessibleWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webService.EAccessibleWebService getEAccessibleWebService() {
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService;
  }
  
  public webService.Caracteristica informacioCaracteristica(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.informacioCaracteristica(arg0);
  }
  
  public int ultimCodiLocal() throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.ultimCodiLocal();
  }
  
  public webService.CaracteristicaTipoLocal[] informacioCaracteristicaTipoLocal(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.informacioCaracteristicaTipoLocal(arg0);
  }
  
  public void baixaLocal(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    eAccessibleWebService.baixaLocal(arg0);
  }
  
  public webService.Local[] cercaLocalPerTipoLocalNomLocalNumero(int arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.cercaLocalPerTipoLocalNomLocalNumero(arg0, arg1, arg2);
  }
  
  public webService.TipoLocal[] llistarTipusLocals() throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.llistarTipusLocals();
  }
  
  public int ultimCodiAccessibilitat() throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.ultimCodiAccessibilitat();
  }
  
  public webService.InformacioAccessibilitatLocal[] llistarAccessibilitatLocal(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.llistarAccessibilitatLocal(arg0);
  }
  
  public webService.Local[] cercaLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    return eAccessibleWebService.cercaLocalPerTipoLocal(arg0);
  }
  
  public void altaLocal(webService.Local arg0, webService.Accessibilitat[] arg1) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    eAccessibleWebService.altaLocal(arg0, arg1);
  }
  
  public void validacioLocal(int arg0) throws java.rmi.RemoteException{
    if (eAccessibleWebService == null)
      _initEAccessibleWebServiceProxy();
    eAccessibleWebService.validacioLocal(arg0);
  }
  
  
}