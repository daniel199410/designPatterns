package structural.proxy.cachingProxy.lib;

import structural.proxy.cachingProxy.Video;

import java.util.Map;

public interface ThirdPartyYoutubeLib {
    Map<String, Video> popularVideos();
    Video getVideo(String id);
}
