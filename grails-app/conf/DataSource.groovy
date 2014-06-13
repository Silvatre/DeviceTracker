dataSource {
    pooled = true
    driverClassName = "org.postgresql.Driver"
	dialect = "org.hibernate.dialect.PostgreSQLDialect"
    username = "olkvacrruzxgtb"
    password = "YDmkD3TAOhhc4KnRo9m_gnPUqc"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:postgresql://ec2-54-204-41-178.compute-1.amazonaws.com:5432/d7sk6jk9pn1tus?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:postgresql://ec2-54-204-41-178.compute-1.amazonaws.com:5432/d7sk6jk9pn1tus?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
	        driverClassName = "org.postgresql.Driver"
	        dialect = org.hibernate.dialect.PostgreSQLDialect
	
	        uri = new URI(System.env.DATABASE_URL?:"postgres://test:test@localhost/test")
	
	        url = "jdbc:postgresql://"+uri.host+uri.path
	        username = uri.userInfo.split(":")[0]
	        password = uri.userInfo.split(":")[1]
        }
    }
}
