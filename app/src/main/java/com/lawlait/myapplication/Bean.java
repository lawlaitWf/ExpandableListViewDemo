package com.lawlait.myapplication;

import java.util.List;

/**
 * Created by lawlait on 2017/12/2.
 */

public class Bean {

    /**
     * data : {"list":[{"group_has_men":0,"group_need_num":1,"group_type":"组一","profession_work_group":"防水工组一","wage":"1.00","work_group_id":923},{"group_has_men":0,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"group_has_men":0,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}],"profession_list":[{"profession_has_men":0,"profession_name":"防水工","profession_need_men":"1","work_group":[{"goup_has_men":0,"goup_need_num":1,"group_need_num":1,"group_type":"组一","profession_work_group":"防水工组一","wage":"1.00","work_group_id":923}]},{"profession_has_men":0,"profession_name":"水泥工","profession_need_men":"5","work_group":[{"goup_has_men":0,"goup_need_num":2,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"goup_has_men":0,"goup_need_num":3,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}]},{"profession_has_men":0,"profession_name":"水泥工","profession_need_men":"5","work_group":[{"goup_has_men":0,"goup_need_num":2,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"goup_has_men":0,"goup_need_num":3,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}]}],"res":{"e_id":7,"job_description":"开工了，来发财吧","map_lat":"30.649504","map_lng":"114.344635","need":6,"order_no":"2017120117174254555554","project_money":"9.00","project_name":"新内招","secret_num":"NZKD22D1JQBKI73362","work_address":"武汉市江岸路沿江大道八号汽车工业园","work_city":"武汉市","work_district":"江岸区","work_end_date":"2017-12-04","work_province":"湖北省","work_start_date":"2017-12-04"}}
     * flag : 1
     * msg : ok
     */

    public DataBean data;
    public int flag;
    public String msg;

    public static class DataBean {
        /**
         * list : [{"group_has_men":0,"group_need_num":1,"group_type":"组一","profession_work_group":"防水工组一","wage":"1.00","work_group_id":923},{"group_has_men":0,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"group_has_men":0,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}]
         * profession_list : [{"profession_has_men":0,"profession_name":"防水工","profession_need_men":"1","work_group":[{"goup_has_men":0,"goup_need_num":1,"group_need_num":1,"group_type":"组一","profession_work_group":"防水工组一","wage":"1.00","work_group_id":923}]},{"profession_has_men":0,"profession_name":"水泥工","profession_need_men":"5","work_group":[{"goup_has_men":0,"goup_need_num":2,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"goup_has_men":0,"goup_need_num":3,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}]},{"profession_has_men":0,"profession_name":"水泥工","profession_need_men":"5","work_group":[{"goup_has_men":0,"goup_need_num":2,"group_need_num":2,"group_type":"组一","profession_work_group":"水泥工组一","wage":"1.00","work_group_id":924},{"goup_has_men":0,"goup_need_num":3,"group_need_num":3,"group_type":"组二","profession_work_group":"水泥工组二","wage":"1.00","work_group_id":925}]}]
         * res : {"e_id":7,"job_description":"开工了，来发财吧","map_lat":"30.649504","map_lng":"114.344635","need":6,"order_no":"2017120117174254555554","project_money":"9.00","project_name":"新内招","secret_num":"NZKD22D1JQBKI73362","work_address":"武汉市江岸路沿江大道八号汽车工业园","work_city":"武汉市","work_district":"江岸区","work_end_date":"2017-12-04","work_province":"湖北省","work_start_date":"2017-12-04"}
         */

        public ResBean res;
        public List<ListBean> list;
        public List<ProfessionListBean> profession_list;

        public static class ResBean {
            /**
             * e_id : 7
             * job_description : 开工了，来发财吧
             * map_lat : 30.649504
             * map_lng : 114.344635
             * need : 6
             * order_no : 2017120117174254555554
             * project_money : 9.00
             * project_name : 新内招
             * secret_num : NZKD22D1JQBKI73362
             * work_address : 武汉市江岸路沿江大道八号汽车工业园
             * work_city : 武汉市
             * work_district : 江岸区
             * work_end_date : 2017-12-04
             * work_province : 湖北省
             * work_start_date : 2017-12-04
             */

            public int e_id;
            public String job_description;
            public String map_lat;
            public String map_lng;
            public int need;
            public String order_no;
            public String project_money;
            public String project_name;
            public String secret_num;
            public String work_address;
            public String work_city;
            public String work_district;
            public String work_end_date;
            public String work_province;
            public String work_start_date;
        }

        public static class ListBean {
            /**
             * group_has_men : 0
             * group_need_num : 1
             * group_type : 组一
             * profession_work_group : 防水工组一
             * wage : 1.00
             * work_group_id : 923
             */

            public int group_has_men;
            public int group_need_num;
            public String group_type;
            public String profession_work_group;
            public String wage;
            public int work_group_id;
        }

        public static class ProfessionListBean {
            /**
             * profession_has_men : 0
             * profession_name : 防水工
             * profession_need_men : 1
             * work_group : [{"goup_has_men":0,"goup_need_num":1,"group_need_num":1,"group_type":"组一","profession_work_group":"防水工组一","wage":"1.00","work_group_id":923}]
             */

            public int profession_has_men;
            public String profession_name;
            public String profession_need_men;
            public List<WorkGroupBean> work_group;

            public static class WorkGroupBean {
                /**
                 * goup_has_men : 0
                 * goup_need_num : 1
                 * group_need_num : 1
                 * group_type : 组一
                 * profession_work_group : 防水工组一
                 * wage : 1.00
                 * work_group_id : 923
                 */

                public int goup_has_men;
                public int goup_need_num;
                public int group_need_num;
                public String group_type;
                public String profession_work_group;
                public String wage;
                public int work_group_id;
            }
        }
    }
}
