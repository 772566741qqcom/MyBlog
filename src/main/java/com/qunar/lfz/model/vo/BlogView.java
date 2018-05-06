package com.qunar.lfz.model.vo;

import com.qunar.lfz.assist.DateTimeUtil;
import com.qunar.lfz.model.po.BlogPo;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Author: fuzhi.lai
 * Date: 2018/5/5 下午2:35
 * Create by Intellij idea
 */
/*
                       _oo0oo_
                      o8888888o
                      88" . "88
                      (| -_- |)
                      0\  =  /0
                    ___/`---'\___
                  .' \\|     |// '.
                 / \\|||  :  |||// \
                / _||||| -:- |||||- \
               |   | \\\  -  /// |   |
               | \_|  ''\---/''  |_/ |
               \  .-\__  '-'  ___/-. /
             ___'. .'  /--.--\  `. .'___
          ."" '<  `.___\_<|>_/___.' >' "".
         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
         \  \ `_.   \_ __\ /__ _/   .-` /  /
     =====`-.____`.___ \_____/___.-`___.-'=====
                       `=---='
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

               佛祖保佑         永无BUG
*/
@Getter
@Setter
@Accessors(chain = true)
public class BlogView {
    private String title;
    private String showContent;
    private String createTime;

    public BlogView(BlogPo blogPo) {
        this.title = blogPo.getTitle();
        this.showContent = blogPo.getShowContent();
        this.createTime = DateTimeUtil.formatDate(blogPo.getCreateTime(), DateTimeUtil.FORMAT_yyyy_MM_dd);
    }
}