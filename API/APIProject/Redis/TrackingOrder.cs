//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Redis
{
    using System;
    using System.Collections.Generic;
    
    public partial class TrackingOrder
    {
        public int Id { get; set; }
        public System.DateTime DateCreated { get; set; }
        public int Status { get; set; }
        public int OrderId { get; set; }
        public bool IsActive { get; set; }
        public bool IsDelete { get; set; }
        public string Description { get; set; }
        public Nullable<double> Longitude { get; set; }
        public Nullable<double> Latitude { get; set; }
    
        public virtual Order Order { get; set; }
    }
}