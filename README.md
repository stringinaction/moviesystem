# moviesystem
NoUniqueBeanDefinitionException的研究

##自动装配

自动装配时，Bean发生歧义时，在自动装配的Setter上加入Qualifier的注释，用以告知Spring框架，需要使用哪个Bean装配

<pre>
    @Autowired
    @Qualifier("historyMovie")    //自动装配时指定Bean的限定符

    @Component
    @Qualifier("historyMovie")    //定义组件时指定设置指定的限定符
</pre> 

##JAVAConfig手动装配

有多个同类型的Bean时，在Configuration中明示要装配的Bean


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
    
当实现Movie的Bean只有一个时，这样写没有问题，
但当Movie的Bean有多个时，这时参数就无法确定要注入哪个Bean因此就会有问题
