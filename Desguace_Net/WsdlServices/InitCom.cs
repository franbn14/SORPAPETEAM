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
    [System.Web.Services.WebServiceBindingAttribute(Name="InitComPortBinding", Namespace="http://Servicios/")]
    public partial class InitCom : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback getAESKeyOperationCompleted;
        
        private System.Threading.SendOrPostCallback exchangeKeysOperationCompleted;
        
        /// <remarks/>
        public InitCom() {
            this.Url = "http://25.162.2.139:8080/Sor_Servicios/InitCom";
        }
        
        /// <remarks/>
        public event getAESKeyCompletedEventHandler getAESKeyCompleted;
        
        /// <remarks/>
        public event exchangeKeysCompletedEventHandler exchangeKeysCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", RequestNamespace="http://Servicios/", ResponseNamespace="http://Servicios/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string getAESKey([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] int id) {
            object[] results = this.Invoke("getAESKey", new object[] {
                        id});
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetAESKey(int id, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getAESKey", new object[] {
                        id}, callback, asyncState);
        }
        
        /// <remarks/>
        public string EndgetAESKey(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void getAESKeyAsync(int id) {
            this.getAESKeyAsync(id, null);
        }
        
        /// <remarks/>
        public void getAESKeyAsync(int id, object userState) {
            if ((this.getAESKeyOperationCompleted == null)) {
                this.getAESKeyOperationCompleted = new System.Threading.SendOrPostCallback(this.OngetAESKeyOperationCompleted);
            }
            this.InvokeAsync("getAESKey", new object[] {
                        id}, this.getAESKeyOperationCompleted, userState);
        }
        
        private void OngetAESKeyOperationCompleted(object arg) {
            if ((this.getAESKeyCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.getAESKeyCompleted(this, new getAESKeyCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", RequestNamespace="http://Servicios/", ResponseNamespace="http://Servicios/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string exchangeKeys([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string modulus, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string exponent) {
            object[] results = this.Invoke("exchangeKeys", new object[] {
                        modulus,
                        exponent});
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BeginexchangeKeys(string modulus, string exponent, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("exchangeKeys", new object[] {
                        modulus,
                        exponent}, callback, asyncState);
        }
        
        /// <remarks/>
        public string EndexchangeKeys(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void exchangeKeysAsync(string modulus, string exponent) {
            this.exchangeKeysAsync(modulus, exponent, null);
        }
        
        /// <remarks/>
        public void exchangeKeysAsync(string modulus, string exponent, object userState) {
            if ((this.exchangeKeysOperationCompleted == null)) {
                this.exchangeKeysOperationCompleted = new System.Threading.SendOrPostCallback(this.OnexchangeKeysOperationCompleted);
            }
            this.InvokeAsync("exchangeKeys", new object[] {
                        modulus,
                        exponent}, this.exchangeKeysOperationCompleted, userState);
        }
        
        private void OnexchangeKeysOperationCompleted(object arg) {
            if ((this.exchangeKeysCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.exchangeKeysCompleted(this, new exchangeKeysCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    public delegate void getAESKeyCompletedEventHandler(object sender, getAESKeyCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class getAESKeyCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal getAESKeyCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    public delegate void exchangeKeysCompletedEventHandler(object sender, exchangeKeysCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("wsdl", "4.0.30319.17929")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class exchangeKeysCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal exchangeKeysCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
    }
}
