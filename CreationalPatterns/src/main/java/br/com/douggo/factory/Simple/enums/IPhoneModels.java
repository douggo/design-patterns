package br.com.douggo.factory.Simple.enums;

public enum IPhoneModels implements IModel {

    IPHONE_11 {
        @Override
        public String getModelName() {
            return "11";
        }
    },

    IPHONE_11_PRO {
        @Override
        public String getModelName() {
            return "11 Pro";
        }
    },

    IPHONE_X {
        @Override
        public String getModelName() {
            return "X";
        }
    },

    IPHONE_XS_MAX {
        @Override
        public String getModelName() {
            return "XS MAX";
        }
    }

}
