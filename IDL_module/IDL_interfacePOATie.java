package IDL_module;


/**
* IDL_module/IDL_interfacePOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from IDL_interface.idl
* Thursday, April 16, 2015 5:51:44 PM CDT
*/

public class IDL_interfacePOATie extends IDL_interfacePOA
{

  // Constructors

  public IDL_interfacePOATie ( IDL_module.IDL_interfaceOperations delegate ) {
      this._impl = delegate;
  }
  public IDL_interfacePOATie ( IDL_module.IDL_interfaceOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public IDL_module.IDL_interfaceOperations _delegate() {
      return this._impl;
  }
  public void _delegate (IDL_module.IDL_interfaceOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public void shutdown ()
  {
    _impl.shutdown();
  } // shutdown

  public int[][] sendMatrix (int[] data)
  {
    return _impl.sendMatrix(data);
  } // sendMatrix

  private IDL_module.IDL_interfaceOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class IDL_interfacePOATie
