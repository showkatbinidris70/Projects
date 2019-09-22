
package com.coderbd.dao;

import com.coderbd.pojo.GetOrder1;

import java.util.List;

public interface GetOrderDao1 {

    void ctreateTable();

    void save(GetOrder1 g);

    void update(GetOrder1 g);

    GetOrder1 getGetOrder1ById(int id);

    GetOrder1 getGetOrder1ByGetOrder1Code(String code);

    void dalete(int id);

    List<GetOrder1> getList();

    public List<GetOrder1> getListByOrderCode(String orderCode);
}
