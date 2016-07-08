# moviesystem
NoUniqueBeanDefinitionException的研究

##自动装配

自动装配时，Bean发生歧义时，在自动装配的Setter上加入Qualifier的注释，用以告知Spring框架，需要使用哪个Bean装配

    @Autowired
    @Qualifier("historyMovie")    //自动装配时才有效

##JAVAConfig装配

在Configuration中明示要装配的Bean
