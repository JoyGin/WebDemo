navicat:https://zhuanlan.zhihu.com/p/545368410

### 数据库操作
- 如果修改数据库编码格式不生效，你可以尝试修改表的编码格式。你可以执行以下命令来修改表的编码格式：ALTER TABLE 表名 CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;。如果还是不行，你可以尝试修改列的编码格式。你可以执行以下命令来修改列的编码格式：ALTER TABLE 表名 MODIFY COLUMN 列名 VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;。

### maven
- 添加tomcat插件
```agsl
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat7-maven-plugin</artifactId>
            <version>2.2</version>
            <configuration>
                <port>8080</port>
                <path>/</path>
            </configuration>
        </plugin>
    </plugins>
</build>
```