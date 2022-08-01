package com.assetco.hotspots.optimization;

import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BugsTest {

  @Test
  public void precedingPartnerWithLongTrailingAssetsDoesNotWin() {
    AssetVendor partnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
    Asset missing = givenAssetInResultsWithVendor(partnerVendor);

    AssetVendor disruptingAssetVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
    Asset disrupting = givenAssetInResultsWithVendor(disruptingAssetVendor);

    List<Asset> expected = givenFourAssetsFromPartnerVendor(partnerVendor);

    whenOptimize();

    thenHotspotDoesNotHave(HotspotKey.Showcase, missing);
    thenHotspotHasExactly(HotspotKey.Showcase, expected);
  }

  private AssetVendor makeVendor(AssetVendorRelationshipLevel partner) {
    return null;
  }

  private Asset givenAssetInResultsWithVendor(AssetVendor partnerVendor) {
    return null;
  }

  private List<Asset> givenFourAssetsFromPartnerVendor(AssetVendor partnerVendor) {
    List<Asset> assets = new ArrayList<>();
    assets.add(givenAssetInResultsWithVendor(partnerVendor));
    assets.add(givenAssetInResultsWithVendor(partnerVendor));
    assets.add(givenAssetInResultsWithVendor(partnerVendor));
    assets.add(givenAssetInResultsWithVendor(partnerVendor));

    return assets;
  }

  private void whenOptimize() {

  }

  private void thenHotspotDoesNotHave(HotspotKey key, Asset asset) {

  }

  private void thenHotspotHasExactly(HotspotKey showcase, List<Asset> expected) {

  }

}
