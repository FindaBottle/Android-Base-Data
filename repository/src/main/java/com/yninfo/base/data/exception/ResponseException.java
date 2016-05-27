package com.yninfo.base.data.exception;

import com.yninfo.base.data.base.ApiResponse;
import com.yninfo.base.data.entity.User;

/**
 * Created by zhaozhiping on 2016/5/22.
 */

public class ResponseException extends Exception
{
    public static final int ERROR_CODE_NEED_LOGIN = -1000;
    public static final int ERROR_NO_DATA = -1;
    public static final int STATUS_CODE_SUCCESS = 0;
    private final int mStatusCode;
    private User mVuser;

    public ResponseException(ApiResponse paramMrResponse)
    {
        super(paramMrResponse.getMessage());
        this.mStatusCode = paramMrResponse.getResult();
        if (this.mStatusCode != -1010)
            return;

    }

    public int getStatusCode()
    {
        return this.mStatusCode;
    }


}
