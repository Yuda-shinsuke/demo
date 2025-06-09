package com.example.demo.entity;

import jakarta.persistence.*; // ← DB関係の注釈を使うために必要

@Entity // このクラスがDBのテーブルに対応することを意味する
public class User {

    @Id // 主キー（テーブルのID）
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自動でIDを採番
    private Long id;

    private String name;  // ユーザー名
    private String email; // メールアドレス

    // 空のコンストラクタ（JPAに必要）
    public User() {}

    // 引数ありコンストラクタ（使いやすくするため）
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getter と setter（データを読み書きするため）
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}