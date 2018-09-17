package com.report;

import java.util.ArrayList;

public class DAOStub {

    public ArrayList<DataBean> getDataBeanList() {
        ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();
        DataBean tempBean = new DataBean();
        tempBean.setName("Petr");
        tempBean.setDiscipline("Math");
        tempBean.setAbsence(2);
        dataBeanList.add(tempBean);

        tempBean = new DataBean();
        tempBean.setName("Vasil");
        tempBean.setDiscipline("History");
        tempBean.setAbsence(3);
        dataBeanList.add(tempBean);

        tempBean = new DataBean();
        tempBean.setName("Ira");
        tempBean.setDiscipline("English");
        tempBean.setAbsence(5);
        dataBeanList.add(tempBean);

        return dataBeanList;
    }

}
