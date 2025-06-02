package com.example.structural.proxy;

/**
 * Subject interface
 */
interface VideoService {
  void playVideo(String videoUrl);
}

/*
 * Subject implementation
 */
class Video4KServiceImpl implements VideoService {
  @Override
  public void playVideo(String videoUrl) {
    System.out.println("Playing 4k Video");
  }
}

class VideoHDServiceImpl implements VideoService {
  @Override
  public void playVideo(String videoUrl) {
    System.out.println("Playing HD Video");
  }
}

/**
 * Create the proxy
 */
class VideoServiceProxy implements VideoService {

  private VideoService videoService;
  private final String subscription;

  public VideoServiceProxy(String subscription) {
    this.subscription = subscription;
  }

  @Override
  public void playVideo(String videoUrl) {

    switch (subscription) {
      case "premium":
        videoService = new Video4KServiceImpl();
        break;
      case "regular":
        videoService = new VideoHDServiceImpl();
        break;
      default:
        break;
    }
    videoService.playVideo(videoUrl);
  }
}

public class ProxyPattern {
  public static void main(String[] args) {

    VideoService premiumProxy = new VideoServiceProxy("premium");
    VideoService regularProxy = new VideoServiceProxy("regular");

    premiumProxy.playVideo("movie");
    regularProxy.playVideo("movie");
  }
}
