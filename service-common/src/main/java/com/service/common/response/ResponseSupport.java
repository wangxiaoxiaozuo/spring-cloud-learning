package com.service.common.response;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 09:40
 * @Description:
 */
public class ResponseSupport {

    public static BaseResponse ok() {
        return ok(null);
    }

    public static BaseResponse ok(Object data) {
        return ResponseSupport.of(ResponseEnum.OK.getCode(),ResponseEnum.OK.getMessage(),data);
    }

    public static BaseResponse success(String message, Object data) {
        return ResponseSupport.of(ResponseEnum.OK.getCode(), message, data);
    }

    public static BaseResponse success(String message) {
        return success(message, null);
    }

    public static BaseResponse saveSuccess() {
        return saveSuccess(null);
    }

    public static BaseResponse saveSuccess(Object data) {
        return success("新增成功", data);
    }

    public static BaseResponse delSuccess() {
        return delSuccess(null);
    }

    public static BaseResponse delSuccess(Object data) {
        return success("删除成功", data);
    }

    public static BaseResponse updateSuccess() {
        return updateSuccess(null);
    }

    public static BaseResponse updateSuccess(Object data) {
        return success("修改成功", data);
    }


    public static BaseResponse fail() {
        return fail(ResponseEnum.FAIL.getMessage());
    }

    public static BaseResponse fail(String message) {
        return ResponseSupport.of(ResponseEnum.FAIL.getCode(), message, null);
    }


    public static BaseResponse of(String code, String message, Object data) {
        return new Builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
    }

    private static class Builder {
        private BaseResponse BaseResponse;

        public Builder() {
            this.BaseResponse = new BaseResponse();
        }

        public Builder code(String code) {
            this.BaseResponse.setCode(code);
            return this;
        }

        public Builder message(String message) {
            this.BaseResponse.setMsg(message);
            return this;
        }

        public Builder data(Object data) {
            this.BaseResponse.setData(data);
            return this;
        }

        public BaseResponse build() {
            return this.BaseResponse;
        }
    }
}
