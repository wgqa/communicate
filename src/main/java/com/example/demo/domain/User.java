package com.example.demo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 用户表
 */

public class User {
        private Long id;

        private Long userId;

        private String passWord;

        private String userName;

        public Long getUserId() {
                return userId;
        }

        public Long getId() {
                return id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserId(Long userId) {
                this.userId = userId;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }


        @Override
        public String toString() {
                return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                        .append("id", getId())
                        .append("userId", getUserId())
                        .append("userName", getUserName())
                        .toString();
        }
}
