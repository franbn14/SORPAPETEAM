﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.17929
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// This source code was auto-generated by wsdl, Version=4.0.30319.17929.
// 
namespace WsdlService {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="DarIdDesguacebyCifPortBinding", Namespace="http://Servicios/")]
    public partial class DarIdDesguacebyCif : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback getIdDesOperationCompleted;
        
        /// <remarks/>
        public DarIdDesguacebyCif() {
            this.Url = "http://25.162.2.139:8080/Sor_Servicios/DarIdDesguacebyCif";
        }
        
        /// <remarks/>
        public event getIdDesCompletedEventHandler getIdDesCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", RequestNamespace="http://Servicios/", ResponseNamespace="http://Servicios/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int getIdDes([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] int id, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string nif) {
            object[] results = this.Invoke("getIdDes", new object[] {
                        id,
                        nif});
            return ((int)(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetIdDes(int id, string nif, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getIdDes", new object[] {
                        id,
                        nif}, callback, asyncState);
        }
        
        /// <remarks/>
        public int EndgetIdDes(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((int)(results[0]));
        }
        
        /// <remarks/>
        public void getIdDesAsync(int id, string nif) {
            this.getIdDesAsync(id, nif, null);
        }
        
        /// <remarks/>
        public void getIdDesAsync(int id, string nif, object userState) {
            if ((this.getIdDesOperationCompleted == null)) {
                this.getIdDesOperationCompleted = new System.Threading.SendOrPostCallback(this.OngetIdDesOperationCompleted);
            }
            this.InvokeAsync("getIdDes", new object[] {
                        id,
                        nif}, this.getIdDesOperationCompleted, userState);
        }
        
        private void OngetIdDesOperationCompleted(object arg) {
            if ((this.getIdDesCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.getIdDesCompleted(this, new getIdDesCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    public delegate void getIdDesCompletedEventHandler(object sender, getIdDesCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class getIdDesCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal getIdDesCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public int Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((int)(this.results[0]));
            }
        }
    }
}
