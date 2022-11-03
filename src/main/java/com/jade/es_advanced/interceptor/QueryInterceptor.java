package com.jade.es_advanced.interceptor;

import cn.easyes.annotation.Intercepts;
import cn.easyes.annotation.Signature;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import cn.easyes.core.conditions.interfaces.BaseEsMapper;
import cn.easyes.extension.context.Interceptor;
import cn.easyes.extension.context.Invocation;
import com.jade.es_advanced.entity.GeneralBean;

/**
 * <p>
 * 统一查询拦截器 demo
 * </p>
 *
 * @author lilu
 * @since 2022/3/4
 */
@Intercepts(
        {
                @Signature(type = BaseEsMapper.class, method = "selectList", args = {LambdaEsQueryWrapper.class}),
        }
)
//@Component
public class QueryInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("啊啊啊，我拦截到了查询，统一增加查询条件");
        // 查询条件中统一加入逻辑删除状态为未删除
        Object[] args = invocation.getArgs();
        LambdaEsQueryWrapper<GeneralBean> arg = (LambdaEsQueryWrapper) args[0];
        arg.eq(GeneralBean::getExistStatus, true);
        return invocation.proceed();
    }

}
