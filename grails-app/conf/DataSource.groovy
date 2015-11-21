dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = false
    cache.use_query_cache = false
    cache.region.provider_class = 'com.googlecode.hibernate.memcached.MemcachedCacheProvider'
}
// environment specific settings
environments {
    development {

        grails {
            mongo {
                host = "localhost"
                port = 27017
//				username = "e4s"
//				password = "e4s12345"
                databaseName = "app19053123"
                pooled=true
            }
        }


    }
    test {
        dataSource {
            pooled = true
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {

        dataSource {
            pooled = true
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }

}