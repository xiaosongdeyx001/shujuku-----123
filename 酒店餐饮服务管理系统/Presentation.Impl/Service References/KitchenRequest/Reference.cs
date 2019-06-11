﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace HCSMS.Presentation.Impl.KitchenRequest {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="KitchenRequest.IKitchenRequest", CallbackContract=typeof(HCSMS.Presentation.Impl.KitchenRequest.IKitchenRequestCallback))]
    public interface IKitchenRequest {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/ListenToServer", ReplyAction="http://tempuri.org/IKitchenRequest/ListenToServerResponse")]
        void ListenToServer();
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IKitchenRequestCallback {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/ChangeItem", ReplyAction="http://tempuri.org/IKitchenRequest/ChangeItemResponse")]
        System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> ChangeItem(System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> itemList);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/ChangeTable", ReplyAction="http://tempuri.org/IKitchenRequest/ChangeTableResponse")]
        System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> ChangeTable(System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> itemList);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/OrderItem", ReplyAction="http://tempuri.org/IKitchenRequest/OrderItemResponse")]
        System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> OrderItem(System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> itemList);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/DeorderItem", ReplyAction="http://tempuri.org/IKitchenRequest/DeorderItemResponse")]
        System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> DeorderItem(System.Collections.Generic.List<HCSMS.Model.RequestHandleInfo> itemList);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IKitchenRequest/PrioritizeDish", ReplyAction="http://tempuri.org/IKitchenRequest/PrioritizeDishResponse")]
        void PrioritizeDish(string tableNumber, string itemId, HCSMS.Model.PriorityLevel level);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IKitchenRequestChannel : HCSMS.Presentation.Impl.KitchenRequest.IKitchenRequest, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class KitchenRequestClient : System.ServiceModel.DuplexClientBase<HCSMS.Presentation.Impl.KitchenRequest.IKitchenRequest>, HCSMS.Presentation.Impl.KitchenRequest.IKitchenRequest {
        
        public KitchenRequestClient(System.ServiceModel.InstanceContext callbackInstance) : 
                base(callbackInstance) {
        }
        
        public KitchenRequestClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName) : 
                base(callbackInstance, endpointConfigurationName) {
        }
        
        public KitchenRequestClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName, string remoteAddress) : 
                base(callbackInstance, endpointConfigurationName, remoteAddress) {
        }
        
        public KitchenRequestClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(callbackInstance, endpointConfigurationName, remoteAddress) {
        }
        
        public KitchenRequestClient(System.ServiceModel.InstanceContext callbackInstance, System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(callbackInstance, binding, remoteAddress) {
        }
        
        public void ListenToServer() {
            base.Channel.ListenToServer();
        }
    }
}
