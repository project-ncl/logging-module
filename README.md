To create new filter in EAP do one of:

```
/subsystem=logging/filter=prefixFilter:add(module=org.jboss.pnc.logging,class=org.jboss.pnc.logging.LoggerNamePrefixFilter,properties={prefix=org.jboss.pnc})
/subsystem=logging/filter=patternFilter:add(module=org.jboss.pnc.logging,class=org.jboss.pnc.logging.LoggerNamePatternFilter,properties={pattern=org.jboss.pnc.*})
```

To add the filter to handler do one of:
```
/subsystem=logging/console-handler=CONSOLE:write-attribute(name=filter-spec, value=prefixFilter)
/subsystem=logging/console-handler=CONSOLE:write-attribute(name=filter-spec, value=paternFilter)
```

