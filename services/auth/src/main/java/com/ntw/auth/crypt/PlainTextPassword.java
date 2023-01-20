//////////////////////////////////////////////////////////////////////////////
// Copyright 2020 Anurag Yadav (anurag.yadav@newtechways.com)               //
//                                                                          //
// Licensed under the Apache License, Version 2.0 (the "License");          //
// you may not use this file except in compliance with the License.         //
// You may obtain a copy of the License at                                  //
//                                                                          //
//     http://www.apache.org/licenses/LICENSE-2.0                           //
//                                                                          //
// Unless required by applicable law or agreed to in writing, software      //
// distributed under the License is distributed on an "AS IS" BASIS,        //
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. //
// See the License for the specific language governing permissions and      //
// limitations under the License.                                           //
//////////////////////////////////////////////////////////////////////////////

package com.ntw.auth.crypt;

/**
 * Created by anurag on 22/09/20.
 */
public class PlainTextPassword implements PasswordCrypt {

    @Override
    public String hashPassword(String plainTextPassword) {
        return plainTextPassword;
    }

    @Override
    public boolean checkPassword(String plainTextPassword, String storedHash) {
        return plainTextPassword.equals(storedHash);
    }

}
