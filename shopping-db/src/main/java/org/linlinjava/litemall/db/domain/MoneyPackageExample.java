package org.linlinjava.litemall.db.domain;

import java.util.ArrayList;
import java.util.List;

public class MoneyPackageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money_package
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money_package
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table money_package
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public MoneyPackageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public MoneyPackageExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public MoneyPackageExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public static Criteria newAndCreateCriteria() {
        MoneyPackageExample example = new MoneyPackageExample();
        return example.createCriteria();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public MoneyPackageExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public MoneyPackageExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money_package
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andIdLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andMoneyLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("money <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andCountLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`count` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andSortLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("sort <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andTypeLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("`type` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andHasloadIsNull() {
            addCriterion("hasload is null");
            return (Criteria) this;
        }

        public Criteria andHasloadIsNotNull() {
            addCriterion("hasload is not null");
            return (Criteria) this;
        }

        public Criteria andHasloadEqualTo(Integer value) {
            addCriterion("hasload =", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadNotEqualTo(Integer value) {
            addCriterion("hasload <>", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadNotEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadGreaterThan(Integer value) {
            addCriterion("hasload >", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadGreaterThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasload >=", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadGreaterThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadLessThan(Integer value) {
            addCriterion("hasload <", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadLessThanColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadLessThanOrEqualTo(Integer value) {
            addCriterion("hasload <=", value, "hasload");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria andHasloadLessThanOrEqualToColumn(MoneyPackage.Column column) {
            addCriterion(new StringBuilder("hasload <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHasloadIn(List<Integer> values) {
            addCriterion("hasload in", values, "hasload");
            return (Criteria) this;
        }

        public Criteria andHasloadNotIn(List<Integer> values) {
            addCriterion("hasload not in", values, "hasload");
            return (Criteria) this;
        }

        public Criteria andHasloadBetween(Integer value1, Integer value2) {
            addCriterion("hasload between", value1, value2, "hasload");
            return (Criteria) this;
        }

        public Criteria andHasloadNotBetween(Integer value1, Integer value2) {
            addCriterion("hasload not between", value1, value2, "hasload");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money_package
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table money_package
         *
         * @mbg.generated
         */
        private MoneyPackageExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        protected Criteria(MoneyPackageExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public MoneyPackageExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table money_package
             *
             * @mbg.generated
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table money_package
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table money_package
         *
         * @mbg.generated
         */
        void example(org.linlinjava.litemall.db.domain.MoneyPackageExample example);
    }
}