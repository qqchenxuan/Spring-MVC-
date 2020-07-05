package com.spring.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    public GoodsExample(){oredCriteria=new ArrayList<Criteria>(); }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    public Criteria or(){
        Criteria criteria=createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria(){
        Criteria criteria=createCriteriaInternal();
        if(oredCriteria.size()==0){
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal(){
        Criteria criteria=new Criteria();
        return criteria;
    }

    public void clear(){
        oredCriteria.clear();
        orederByClause=null;
        distinct=false;
    }

    protected abstract static class GeneratedCriteria{
        protected List<Criterion> criteria;
        protected GeneratedCriteria(){
            super();
            criteria=new ArrayList<Criterion>();
        }

        public boolean isValid(){
            return criteria.size()>0;
        }

        public List<Criterion> getAllCriteria(){return criteria;}

        public List<Criterion> getCriteria(){return criteria;}

        protected void addCriterion(String condition){
            if(condition==null){
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition,Object value,String property){
            if(value==null){
                throw new RuntineException("Value for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value));
        }

        protected void addCriterion(String condition,Object value1,Object value2,String property){
            if(value1==null||value2==null){
                throw new RuntineException("Between value for"+property+"cannot be null");
            }
            criteria.add(new Criterion(condition,value1,value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value,String property){
            if(value==null){
                throw new RuntineException("Value for"+property+"cannot be null");
            }
            addCriterion(condition,new java.sql.Date(value.getTime()),property);
        }

        protected void addCriterionForJDBCDate(String condition,List<Date> values,String property){
            if(values==null||values.size()==0){
                throw new RuntineException("Value list for"+property+"cannot be null or empty");
            }
            List<java.sql.Date> dateList=new ArrayList<~>();
            Iterator<Date> iter=values.iterator();
            while (iter.hasNext()){
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition,dateList,property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1,Date value2,String property){
            if(value1==null||value2==null){
                throw new RuntineException("Between value for"+property+"cannot be null");
            }
            addCriterion(condition,new java.sql.Date(value1.getTime()),new java.sql.Date(value2.getTime()),property);
        }

        public Criteria andIdIsNull(){
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull(){
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value){
            addCriterion("id=",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value){
            addCriterion("id <>",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value){
            addCriterion("id >",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value){
            addCriterion("id >=",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value){
            addCriterion("id <",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value){
            addCriterion("id <=",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdIn(Integer value){
            addCriterion("id in",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> value){
            addCriterion("id in",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(Integer value){
            addCriterion("id not in",value,"id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1,Integer value2){
            addCriterion("id between",value1,value2,"id");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Integer value){
            addCriterion("name =",value,"name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Integer value){
            addCriterion("name <>",value,"name");
            return (Criteria) this;
        }

        public Criteria andNameGreateThan(Integer value){
            addCriterion("name >",value,"name");
            return (Criteria) this;
        }

        public Criteria andNameGreateThanOrEqualTo(Integer value){
            addCriterion("name <",value,"name");
            return (Criteria) this;
        }

        public static class Criterion{
            private String condition;
            private Object value;
            private Object secondValue;
            private boolean noValue;
            private boolean singleValue;
            private boolean betweebValue;
            private boolean listValue;
            private String typeHandler;

            public String getCondition() {
                return condition;
            }

            public void setCondition(String condition) {
                this.condition = condition;
            }

            public Object getValue() {
                return value;
            }

            public void setValue(Object value) {
                this.value = value;
            }

            public Object getSecondValue() {
                return secondValue;
            }

            public void setSecondValue(Object secondValue) {
                this.secondValue = secondValue;
            }

            public boolean isNoValue() {
                return noValue;
            }

            public void setNoValue(boolean noValue) {
                this.noValue = noValue;
            }

            public boolean isSingleValue() {
                return singleValue;
            }

            public void setSingleValue(boolean singleValue) {
                this.singleValue = singleValue;
            }

            public boolean isBetweebValue() {
                return betweebValue;
            }

            public void setBetweebValue(boolean betweebValue) {
                this.betweebValue = betweebValue;
            }

            public boolean isListValue() {
                return listValue;
            }

            public void setListValue(boolean listValue) {
                this.listValue = listValue;
            }

            public String getTypeHandler() {
                return typeHandler;
            }

            public void setTypeHandler(String typeHandler) {
                this.typeHandler = typeHandler;
            }

            public Criterion(String condition, Object value, Object secondValue, boolean noValue, boolean singleValue, boolean betweebValue, boolean listValue, String typeHandler) {
                this.condition = condition;
                this.value = value;
                this.secondValue = secondValue;
                this.noValue = noValue;
                this.singleValue = singleValue;
                this.betweebValue = betweebValue;
                this.listValue = listValue;
                this.typeHandler = typeHandler;
            }
        }
    }

}
