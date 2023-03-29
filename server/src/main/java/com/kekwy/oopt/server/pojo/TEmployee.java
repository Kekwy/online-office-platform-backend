package com.kekwy.oopt.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kekwy
 * @since 2023-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name="TEmployee对象", description="")
public class TEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "员工编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工姓名")
    private String name;

    @Schema(name = "性别")
    private String gender;

    @Schema(name = "出生日期")
    private LocalDate birthday;

    @Schema(name = "身份证号")
    @TableField("idCard")
    private String idCard;

    @Schema(name = "婚姻状况")
    private String wedlock;

    @Schema(name = "民族")
    @TableField("nationId")
    private Integer nationId;

    @Schema(name = "籍贯")
    @TableField("nativePlace")
    private String nativePlace;

    @Schema(name = "政治面貌")
    @TableField("politicId")
    private Integer politicId;

    @Schema(name = "邮箱")
    private String email;

    @Schema(name = "电话号码")
    private String phone;

    @Schema(name = "联系地址")
    private String address;

    @Schema(name = "所属部门")
    @TableField("departmentId")
    private Integer departmentId;

    @Schema(name = "职称ID")
    @TableField("jobLevelId")
    private Integer jobLevelId;

    @Schema(name = "职位ID")
    @TableField("posId")
    private Integer posId;

    @Schema(name = "聘用形式")
    @TableField("engageForm")
    private String engageForm;

    @Schema(name = "最高学历")
    @TableField("tiptopDegree")
    private String tiptopDegree;

    @Schema(name = "所属专业")
    private String specialty;

    @Schema(name = "毕业院校")
    private String school;

    @Schema(name = "入职日期")
    @TableField("beginDate")
    private LocalDate beginDate;

    @Schema(name = "在职状态")
    @TableField("workState")
    private String workState;

    @Schema(name = "工号")
    @TableField("workID")
    private String workID;

    @Schema(name = "合同期限")
    @TableField("contractTerm")
    private Double contractTerm;

    @Schema(name = "转正日期")
    @TableField("conversionTime")
    private LocalDate conversionTime;

    @Schema(name = "离职日期")
    @TableField("notWorkDate")
    private LocalDate notWorkDate;

    @Schema(name = "合同起始日期")
    @TableField("beginContract")
    private LocalDate beginContract;

    @Schema(name = "合同终止日期")
    @TableField("endContract")
    private LocalDate endContract;

    @Schema(name = "工龄")
    @TableField("workAge")
    private Integer workAge;

    @Schema(name = "工资账套ID")
    @TableField("salaryId")
    private Integer salaryId;


}
