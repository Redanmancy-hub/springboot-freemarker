package com.springboot.springbootfreemarker.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("gas_old_man")
public class Old {

    private static final long serialVersionUID=1L;

    /**
     * 老人id
     */
    @TableId(value = "old_man_id",type = IdType.AUTO)
    private Long oldManId;
    /**
     * 老人姓名
     */
    private String oldManName;
    /**
     * 老人出生日期;老人出生日期
     */
    private Date oldManBirth;
    /**
     * 老人电话
     */
    private String oldManPhone;
    /**
     * 老人群体类型;1-独居 2-偶居
     */
    private Long oldManType;
    /**
     * 老人居住详细地址
     */
    private String oldManDetailedAddress;
    /**
     * 老人户籍地址
     */
    private String oldManDomicile;
    /**
     * 老人居住类型
     */
    private String oldManLive;
    /**
     * 老人身份证号码
     */
    private String oldManIdCard;
    /**
     * 老人学历;0-无学历 1-小学 2-初中 3-高中 4-大专 5-本科 6-研究生
     */
    private Long oldManEducation;
    /**
     * 老人入院意向;1-想 2-不想
     */
    private Long oldManIntention;
    /**
     * 老人职业
     */
    private String oldManCareer;
    /**
     * 老人生活习惯
     */
    private String oldManHabits;
    /**
     * 老人被服务次数
     */
    private Long oldManServiced;
    /**
     * 老人过敏记录
     */
    private String oldManAllergy;
    /**
     * 老人残疾情况
     */
    private String oldManDisability;
    /**
     * 老人生活能力等级;1-可以独立 2部分独立 3-需要辅助 4-需要依赖
     */
    private Long oldManLevel;
    /**
     * 老人饮食信息
     */
    private String oldManDietary;
    /**
     * 老人婚姻状况 1-未婚 2-已婚 3-丧偶 4-离婚 5.未说明的婚姻状况
     */
    private Long oldManMarriage;
    /**
     * 老人备注
     */
    private String oldManNotes;
    /**
     * 逻辑删除;0-未删除 1-已删除
     */
    private Long isDel;
    /**
     * 省地址
     */
    private Long addressProvinceId;
    /**
     * 市地址
     */
    private Long addressCityId;
    /**
     * 区地址
     */
    private Long addressAreaId;
    /**
     * 镇地址
     */
    private Long addressTownId;
    /**
     * 街道地址
     */
    private Long addressSheetId;

    /**
     * 老人性别
     */

    private char oldManSex;
}
