package Game.Data;

import Game.Data.Enums.temp1.CatalogSortType;
import Game.Data.Enums.temp1.CatalogCategoryFilter;
import Game.Data.Enums.temp1.BundleType;
import Game.Data.Enums.temp1.AvatarAssetType;

public class CatalogSearchParams {

    String SearchKeyword;

    public float minPrice;
    public float maxPrice;

    public CatalogSortType SortType;
    public CatalogCategoryFilter CategoryFilter;
    public BundleType[] BundleType;
    public AvatarAssetType[] AssetType;

    public void SetCatalogSearchParams(float MIN_PRICE, float MAX_PRICE){//, SORT_TYPE, CATALOG_CATEGORY_FILTER, BUNDLE_TYPE, AVATAR_ASSET_TYPE){

        this.minPrice = MIN_PRICE;
        this.maxPrice = MAX_PRICE;
        //this.SortType = SORT_TYPE;
        //this.CatalogCategoryFilter = CATALOG_CATEGORY_FILTER;
        //this.BundleType = BUNDLY_TYPE
        //this.AvatarAssetType = AVATAR_ASSET_TYPE;

    }
}
