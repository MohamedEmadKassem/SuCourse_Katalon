<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Invalid credentials.                   _173ecb</name>
   <tag></tag>
   <elementGuidId>9a3fe115-2234-4b82-b1dd-c083cee2c6c3</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='content']/div[2]/div/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.card-body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>card-body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                    
                        
                            Invalid credentials.
                        


                        
                            Username:

                            
                                
                                  
                                        @
                                        
                                            sabanciuniv.edu
                                            alumni.sabanciuniv.edu
                                            emeritus.sabanciuniv.edu
                                            connect.sabanciuniv.edu
                                        
                                    
                                
                            
                        

                        
                            Password:

                            
                                
                                
                            
                        

                        
                            
                                Remember Me
                            
                        

                        

                    Reset / Change password?

                    
                        var i = &quot;One moment please...&quot;
                        $( document ).ready(function() {

                            $('#username').on('keypress', function (event) {
                                var regex = new RegExp(&quot;^[a-zA-Z0-9-_.]+$&quot;);
                                var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
                                if (!regex.test(key)) {
                                   event.preventDefault();
                                   return false;
                                }
                            });

                            $(&quot;#fm1&quot;).submit(function () {
                                $(&quot;:submit&quot;).attr(&quot;disabled&quot;, true);
                                $(&quot;:submit&quot;).attr(&quot;value&quot;, i);
                                console.log(i);
                                return true;
                            });
                        });
                    
                    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content&quot;)/div[@class=&quot;col-md-3 col-sm-4 col-xs-12&quot;]/div[@class=&quot;card&quot;]/div[@class=&quot;card-body&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='content']/div[2]/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='log out'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='login.sabanciuniv.edu'])[1]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
