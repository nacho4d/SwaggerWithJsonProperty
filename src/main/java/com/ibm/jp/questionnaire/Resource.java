package com.ibm.jp.questionnaire;

import com.ibm.jp.questionnaire.pojo.Project;
import com.ibm.jp.questionnaire.pojo.ProjectWithJsonProperty;
import com.ibm.jp.questionnaire.pojo.Result;
import com.ibm.jp.questionnaire.pojo.ResultWithJsonProperty;
import io.swagger.annotations.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.mfp.adapter.api.OAuthSecurity;

@Api(value = "API with Pojo with @JsonProperty (カスタムプロパティ)")
@Path("/pojo")
public class Resource {

    @ApiOperation(value = "API with normal pojo.")
    @POST
    @Path("/normal")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @OAuthSecurity(enabled = false)
    public Result pullProjectData(Project project) {
        String message;
        message = "message: " + (project.getName() == null ? "null" : ("'" + project.getName() + "'"));
        message += ", years: '" + project.getYears() + "'";
        message += ", finished: '" + project.isFinished() + "'";
        Result r = new Result();
        r.setMessage(message);
        return r;
    }

    @ApiOperation(value = "API with pojo with @JsonProperty")
    @POST
    @Path("/with-json-property")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @OAuthSecurity(enabled = false)
    public ResultWithJsonProperty pullProjectData(ProjectWithJsonProperty project) {
        String message;
        message = "message(expected key: projectName): " + (project.getName() == null ? "null" : ("'" + project.getName() + "'"));
        message += ", years(expected key: number-of-years): '" + project.getYears() + "'";
        message += ", finished(expected key: 完了): '" + project.isFinished() + "'";
        message += ", completed(expected key: 完了ヌルあり): " +
                (project.getCompleted() == null ? "null" : ("'" + project.getCompleted() + "'"));
        message += ", number(expected key: 現在住まい広さ): " +
                (project.getNumber() == null ? "null" : ("'" + project.getNumber() + "'"));
        ResultWithJsonProperty r = new ResultWithJsonProperty();
        r.setMessage(message);
        return r;
    }
}
