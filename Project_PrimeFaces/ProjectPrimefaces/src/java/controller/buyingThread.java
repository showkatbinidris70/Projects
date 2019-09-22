package controller;

import entity.OrderCode;
import implementation.OrderCodeImp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class buyingThread {

    OrderCode orderCode;
    List<OrderCode> orderCodes;
    OrderCodeImp service;

    public void save() {
        service = new OrderCodeImp();
        service.save(orderCode);
        orderCode = new OrderCode();
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Successfull!", null));
        System.out.println("Saved Successfully !");
    }

    public void update() {
        service = new OrderCodeImp();
        service.update(orderCode);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Update Successfull!", null));
        System.out.println("Updated Successfully !");
    }

    public void delete() {
        service = new OrderCodeImp();
        service.delete(orderCode);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete Successfull!", null));
        System.out.println("Deleted Successfully !");
    }

    public OrderCode getOrderCode() {
        if (orderCode == null) {
            orderCode = new OrderCode();
        }
        return orderCode;
    }

    public void setOrderCode(OrderCode orderCode) {
        this.orderCode = orderCode;
    }

    public List<OrderCode> getOrderCodes() {
        orderCodes = new ArrayList<>();
        //service =  new OrderCodeImp();
        //  orderCodes = service.getOrderCodes();
        if (orderCodes.size() == 0) {
          
//            orderCodes.add(new OrderCode("p208", 1000, 500.0, 500.0, new Date(), new Date()));
//            orderCodes.add(new OrderCode("k485", 500, 200.0, 300.0, new Date(), new Date()));
//            orderCodes.add(new OrderCode("1000", 2000, 500.0, 1500.0, new Date(), new Date()));
//            orderCodes.add(new OrderCode("8KR", 700, 200.0, 500.0, new Date(), new Date()));
//            orderCodes.add(new OrderCode("007", 3000, 2000.0, 1000.0, new Date(), new Date()));
//            orderCodes.add(new OrderCode("T84", 7000, 6000.0, 1000.0, new Date(), new Date()));

        }
        return orderCodes;
    }

    public void setOrderCodes(List<OrderCode> orderCodes) {
        this.orderCodes = orderCodes;
    }

}
