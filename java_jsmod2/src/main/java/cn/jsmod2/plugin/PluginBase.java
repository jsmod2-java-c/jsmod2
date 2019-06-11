/*
Jsmod2 is a java-based scpsl server initiated by jsmod2.cn.
It needs to rely on smod2 and proxy. jsmod2 is an open source
free plugin that is released under the GNU license. Please read
the GNU open source license before using the software. To understand
the appropriateness, if infringement, will be handled in accordance
with the law, @Copyright Jsmod2 China,more can see <a href="http://jsmod2.cn">that<a>
 */
package cn.jsmod2.plugin;

import cn.jsmod2.Server;
import cn.jsmod2.log.ILogger;
import cn.jsmod2.plugin.Plugin;
import cn.jsmod2.plugin.PluginClassLoader;
import cn.jsmod2.utils.Utils;
import cn.jsmod2.utils.config.Config;
import cn.jsmod2.utils.config.ConfigQueryer;
import cn.jsmod2.utils.config.ConfigType;

import java.io.File;

/**
 * all of the plugin main-classes must extend it
 *
 * @author magiclu550 #(code) jsmod2
 */


public abstract class PluginBase implements Plugin {

    private boolean haveInit = false;

    private Server server;

    private ILogger logger;

    private String pluginName;

    private boolean isEnabled;

    private File dataFolder;

    private File serverFile;

    private String description;

    private PluginClassLoader classLoader;

    private String version;

    public PluginBase(){
    }

    public void init(ILogger logger,Server server,String pluginName,File serverFile,String description,PluginClassLoader classLoader,File dataFolder,String version){
        if(!haveInit){
            this.logger = logger;
            this.server = server;
            this.pluginName = pluginName;
            this.serverFile = serverFile;
            this.dataFolder = dataFolder;
            this.description = description;
            this.classLoader = classLoader;
            this.version = version;
            this.haveInit = true;
        }
    }

    public boolean isHaveInit() {
        return haveInit;
    }

    public Server getServer() {
        return server;
    }

    public ILogger getLogger() {
        return logger;
    }

    public String getPluginName() {
        return pluginName;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled){
        if(!isEnabled){
            this.isEnabled = true;
            onEnable();
        }
    }

    public File getDataFolder() {
        return dataFolder;
    }

    public File getServerFile() {
        return serverFile;
    }

    public String getDescription() {
        return description;
    }

    public PluginClassLoader getClassLoader() {
        return classLoader;
    }

    public String getVersion(){
        return version;
    }

    public void initConfig(){
        Utils.TryCatch(()->{
            Config config = ConfigQueryer.getInstance(this.dataFolder+"/config.yml",false, ConfigType.YAML);
            config.save();
        });
    }
}