﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace HCSMS.Presentation.Impl.BillingService {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="BillingService.IBillingService")]
    public interface IBillingService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IBillingService/QueryBill", ReplyAction="http://tempuri.org/IBillingService/QueryBillResponse")]
        HCSMS.Model.Bill QueryBill(string tableNumber);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IBillingService/PayBill", ReplyAction="http://tempuri.org/IBillingService/PayBillResponse")]
        void PayBill(HCSMS.Model.Bill aBill);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IBillingServiceChannel : HCSMS.Presentation.Impl.BillingService.IBillingService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class BillingServiceClient : System.ServiceModel.ClientBase<HCSMS.Presentation.Impl.BillingService.IBillingService>, HCSMS.Presentation.Impl.BillingService.IBillingService {
        
        public BillingServiceClient() {
        }
        
        public BillingServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public BillingServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public BillingServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public BillingServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public HCSMS.Model.Bill QueryBill(string tableNumber) {
            return base.Channel.QueryBill(tableNumber);
        }
        
        public void PayBill(HCSMS.Model.Bill aBill) {
            base.Channel.PayBill(aBill);
        }
    }
}
