# moviesystem
NoUniqueBeanDefinitionException的研究

##自动装配

自动装配时，Bean发生歧义时，在自动装配的Setter上加入Qualifier的注释，用以告知Spring框架，需要使用哪个Bean装配

    @Autowired
    @Qualifier("historyMovie")    //自动装配时才有效

##JAVAConfig装配

在Configuration中明示要装配的Bean


    @Bean
    public Player qqPlayer(HistoryMovie movie){
        QQPlayer player = new QQPlayer(movie);
        return player;
    }


或

    @Bean
    public Player qqPlayer(/*HistoryMovie movie*/){
        QQPlayer player = new QQPlayer(otherMovie());
        return player;
    }
    
都是正确的

    @Bean
    public Player qqPlayer(Movie movie){
        QQPlayer player = new QQPlayer(movie);
        return player;
    }
    
这时，Spring就傻了，初始化这个Bean时哪知道Movie接口对应的是哪个Bean
