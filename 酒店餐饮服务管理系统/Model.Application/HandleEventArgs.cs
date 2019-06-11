﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using HCSMS.Model;
using System.ServiceModel;
using System.Runtime.Serialization;

namespace HCSMS.Model.Application
{
    [DataContract]
    public class HandleEventArgs: EventArgs  
    {
         private string message;
         private List<RequestHandleInfo> request;
   

         public HandleEventArgs(string msg, List<RequestHandleInfo> request)
         {
             this.message = msg;
             this.request = request;
         }
      
        [DataMember]
        public string Message { get { return message; } }

      
        [DataMember]
        public List<RequestHandleInfo> RequestInfo { get { return request; } }
    }
}
