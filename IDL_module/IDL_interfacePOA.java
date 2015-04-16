package IDL_module;


/**
* IDL_module/IDL_interfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from IDL_interface.idl
* Thursday, April 16, 2015 5:51:44 PM CDT
*/

public abstract class IDL_interfacePOA extends org.omg.PortableServer.Servant
 implements IDL_module.IDL_interfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("shutdown", new java.lang.Integer (0));
    _methods.put ("sendMatrix", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // IDL_module/IDL_interface/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       case 1:  // IDL_module/IDL_interface/sendMatrix
       {
         int data[] = IDL_module.IDL_interfacePackage.ArrayHelper.read (in);
         int $result[][] = null;
         $result = this.sendMatrix (data);
         out = $rh.createReply();
         IDL_module.IDL_interfacePackage.MatrixHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:IDL_module/IDL_interface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IDL_interface _this() 
  {
    return IDL_interfaceHelper.narrow(
    super._this_object());
  }

  public IDL_interface _this(org.omg.CORBA.ORB orb) 
  {
    return IDL_interfaceHelper.narrow(
    super._this_object(orb));
  }


} // class IDL_interfacePOA