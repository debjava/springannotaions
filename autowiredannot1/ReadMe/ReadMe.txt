Learn Spring annotations using @Autowired and @Qualifier
--------------------------------------------------------
Autowiring ( @Autowired ) at the field level can be applied.

@Autowired 
private IOrganisation org;

IOrganisation is an interface and its implementation bean must be defined in xml configuration file.

<bean id="ITOrganisation" class="com.ddsoft.rnd.spring.autowire.ITOrganisation"/>

The bean id should be given as per the class name.

If there is an interface and there are multiple implementations for that interface and if your using @Autowired, it will create ambiguities.
To resolve the ambiguities, you have to use @Qualifier.