module data {
    requires lombok;
    requires org.hibernate.commons.annotations;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens pwr.ite.bedrylo.dataModule.model.data;
    opens pwr.ite.bedrylo.dataModule.model.data.enums;
    opens pwr.ite.bedrylo.dataModule.model.request.enums;
    opens pwr.ite.bedrylo.dataModule.model.request;

    exports pwr.ite.bedrylo.dataModule.dto;
    exports pwr.ite.bedrylo.dataModule.model.data.enums;
    exports pwr.ite.bedrylo.dataModule.model.request.enums;
    exports pwr.ite.bedrylo.dataModule.model.request;
    exports pwr.ite.bedrylo.dataModule.model.data;
    exports pwr.ite.bedrylo.dataModule.repository;
    exports pwr.ite.bedrylo.dataModule.repository.implementations.user;
    exports pwr.ite.bedrylo.dataModule.service;
    opens pwr.ite.bedrylo.dataModule.dto;
    exports pwr.ite.bedrylo.dataModule.repository.implementations.commodity;
    exports pwr.ite.bedrylo.dataModule.repository.implementations.receipt;

}
