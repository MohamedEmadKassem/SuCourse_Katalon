<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Welcome to Central Authentication Servi_5c448d_1</name>
   <tag></tag>
   <elementGuidId>a47f38c4-e472-42d8-b693-c0817de51213</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='content']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#content</value>
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>row containerStyle</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
        
            Welcome to Central Authentication Service
            Please, verify the URL for this page begins with login.sabanciuniv.edu For security reasons, please log out and exit your web browser when you are done accessing services that require authentication!
        
    
             
                
            
                

        
        
            


            
                    
                        
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
      <value>id(&quot;content&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='content']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//html[@id='login-page']/body/main/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Central Authentication Service (CAS)'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Jasig'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//main/div</value>
   </webElementXpaths>
</WebElementEntity>
